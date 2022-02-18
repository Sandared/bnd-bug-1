# ${jatoms.project.slug} README
This is a basic Karaf application project template meant to be used with the [Jatoms Maven Plugin](https://gitlab.com/jatoms/jatoms-maven-plugin).
It contains a featurerepository submodule for managing features and bundlen, but does not contain any code yet.

It also contains a [Gitpod](https://www.gitpod.io/) file for easier dvelopment onboarding.

* jatoms.karaf.version: The Karaf version that should be used (Be careful. The used BOM in the root pom.xml is only supported for Karaf versions higher than or equal to 4.3.0)
* jatoms.project.slug: The project slug given to your Git repository (e.g., https://gitlab.com/jatoms/osgi-pg for this url "osgi-pg" would be the slug) This is used for the GitPod setup

An example jatoms.json file for this template could look like this:
```
{
    "karafinit": {
        "version": "4.3.0",
        "slug": "my-project-slug"
    }
}
```
