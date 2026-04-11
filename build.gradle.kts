plugins {
	`maven-publish`

	alias(libs.plugins.fabric.loom)
	alias(libs.plugins.pkpcpbp)
}

version = project.property("mod_version")!!
group = project.property("maven_group")!!

repositories {
	maven("https://dl.cloudsmith.io/public/klikli-dev/mods/maven/")
}

fabricApi {
	configureDataGeneration {
		client = true
	}
}

dependencies {
	// Dependency versions are defined in ./gradle/libs.versions.toml
	minecraft(libs.minecraft)
	
	implementation(libs.fabric.loader)
	implementation(libs.fabric.api)

	implementation(libs.bundles.dependencies)
	localRuntime(libs.bundles.dev.mods)
	
}

tasks.processResources {
	inputs.property("version", version)

	filesMatching("fabric.mod.json") {
		expand("version" to version)
	}
}

tasks.withType<JavaCompile>().configureEach {
	options.release = 25
}

java {
	// Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
	// if it is present.
	// If you remove this line, sources will not be generated.
	withSourcesJar()

	sourceCompatibility = JavaVersion.VERSION_25
	targetCompatibility = JavaVersion.VERSION_25
}

tasks.jar {
	inputs.property("projectName", project.name)

	from("LICENSE") {
		rename { "${it}_${project.name}" }
	}
}

// configure the maven publication
publishing {
	publications {
		register<MavenPublication>("mavenJava") {
			from(components["java"])
		}
	}

	// See https://docs.gradle.org/current/userguide/publishing_maven.html for information on how to set up publishing.
	repositories {
		// Add repositories to publish to here.
		// Notice: This block does NOT have the same function as the block in the top level.
		// The repositories here will be used for publishing your artifact, not for
		// retrieving dependencies.
	}
}
