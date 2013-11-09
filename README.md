# [liveSense :: Framework :: fitnesse - org.liveSense.framework.fitnesse](http://github.com/liveSense/org.liveSense.framework.fitnesse)

# [FitNesse](http://fitnesse.org/)  [![Build Status](https://travis-ci.org/unclebob/fitnesse.png)](https://travis-ci.org/unclebob/fitnesse)

Welcome to FitNesse, the fully integrated stand-alone acceptance testing framework and wiki.

To get started, check out [http://fitnesse.org](http://fitnesse.org)!



## Quick start

* [A One-Minute Description of FitNesse](http://fitnesse.org/FitNesse.UserGuide.OneMinuteDescription)
* [Download FitNesse](http://fitnesse.org/FitNesseDownLoad) and [Plugins](http://fitnesse.org/PlugIns)
* [The FitNesse User Guide](http://fitnesse.org/.FitNesse.UserGuide)



## Bug tracker

Have a bug or a feature request? [Please open a new issue](https://github.com/unclebob/fitnesse/issues). 


## Community

Have a question that's not a feature request or bug report? [Ask on the mailing list.](http://groups.yahoo.com/group/fitnesse)

## Edge builds

The latest stable build of FitNesse can be [downloaded here](https://cleancoder.ci.cloudbees.com/job/fitnesse/lastStableBuild/).

**Note**: the edge Jenkins build produces 2 jars. `fitnesse.jar` is for use in Maven or Ivy. Users who just want to run FitNesse by itself should download `fitnesse-standalone.jar` instead of `fitnesse.jar`.

## Developers

Check out the [FitNesse Story Backlog and Issue Tracking](https://www.pivotaltracker.com/projects/44141) on Pivotal Tracker.

### Building

The `build.xml` and a proper internet connection is sufficient to build FitNesse.
The build process will bootstrap itself by downloading Ivy (dependency management) and from there will download the modules required to build and test FitNesse.

To build and run all tests, run the command

```
$ ant
``` 

which builds the `all` target. 

### Running

To start the FitNesse wiki locally, for example to browse the local version of the User Guide

```
$ ant run
```

### Testing

To run the unit tests:

```
$ ant unit_test
```

To run the acceptance tests:

```
$ ant acceptance_tests
```

There is a second source directory, `srcFitServerTests`, which contains units
tests that test invocation of Fit servers written in Ruby, C++, and .NET. These
tests are not run as part of the normal ant test-related targets. When using an
IDE, make sure it does not invoke these tests when running the "normal" tests
under the `src` directory.

Direct any questions to the FitNesse yahoo group or to [unclebob](https://www.github.com/unclebob).


### Working with Eclipse and IntelliJ

There are a few things to keep in mind when working from an IDE:

1. The Ant build file does some extra things apart from compiling the code.
    * It sets the FitNesse version in a META-INF/FitNesseVersion.txt
    * It copies the dependencies to the lib folder so they can be used by the acceptance tests.

   Perform a
   ```
   $ ant post-compile
   ```
   to execute those actions. In your IDE it is possible to define "post-compilation" steps. If
   you set the "post-compile" target from the build file, you won't have any trouble with
   cleaning, building and executing tests from your IDE.

2. Apache Ivy is used for dependency management. Your IDE can be set up to support Ivy.
    * In IntelliJ set IvyIDEA in "Project Structure" -> "Modules" -> "Dependencies".
    * In Eclipse, install IvyDE and set it up.

   Alternatively,
   ```
   $ ant retrieve
   ```
   will download the dependencies and copy them to lib/, from where your
   IDE can pick them up.


### .NET Support (8/6/2008)

We re-installed the dotnet/*.dll and dotnet/*.exe files, taking them from the
`fitnessedotnet` release on Sourceforge. This will allow the .NET Acceptance
Tests to run right out of this distribution. However, you should consider using
[FitSharp](http://www.syterra.com/FitSharp.html). See the page `FitNesseRoot/FitNesse/DotNet/context.txt` for
more information.


## Description
The fully integrated standalone wiki, and acceptance testing framework.

## OSGi Exported packages
* eg(20130316.0.0.1-SNAPSHOT)
* eg.bowling(20130316.0.0.1-SNAPSHOT)
* eg.bowling.fixtures(20130316.0.0.1-SNAPSHOT)
* eg.employeePayroll(20130316.0.0.1-SNAPSHOT)
* fit(20130316.0.0.1-SNAPSHOT)
* fit.decorator(20130316.0.0.1-SNAPSHOT)
* fit.decorator.exceptions(20130316.0.0.1-SNAPSHOT)
* fit.decorator.performance(20130316.0.0.1-SNAPSHOT)
* fit.decorator.util(20130316.0.0.1-SNAPSHOT)
* fit.exception(20130316.0.0.1-SNAPSHOT)
* fit.testFxtr(20130316.0.0.1-SNAPSHOT)
* fitnesse(20130316.0.0.1-SNAPSHOT)
* fitnesse.authentication(20130316.0.0.1-SNAPSHOT)
* fitnesse.components(20130316.0.0.1-SNAPSHOT)
* fitnesse.fixtures(20130316.0.0.1-SNAPSHOT)
* fitnesse.html(20130316.0.0.1-SNAPSHOT)
* fitnesse.html.template(20130316.0.0.1-SNAPSHOT)
* fitnesse.http(20130316.0.0.1-SNAPSHOT)
* fitnesse.junit(20130316.0.0.1-SNAPSHOT)
* fitnesse.reporting(20130316.0.0.1-SNAPSHOT)
* fitnesse.reporting.history(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders.editing(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders.files(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders.refactoring(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders.run(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders.run.slimResponder(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders.search(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders.testHistory(20130316.0.0.1-SNAPSHOT)
* fitnesse.responders.versions(20130316.0.0.1-SNAPSHOT)
* fitnesse.runner(20130316.0.0.1-SNAPSHOT)
* fitnesse.schedule(20130316.0.0.1-SNAPSHOT)
* fitnesse.slim(20130316.0.0.1-SNAPSHOT)
* fitnesse.slim.converters(20130316.0.0.1-SNAPSHOT)
* fitnesse.slim.fixtureInteraction(20130316.0.0.1-SNAPSHOT)
* fitnesse.slim.instructions(20130316.0.0.1-SNAPSHOT)
* fitnesse.slim.protocol(20130316.0.0.1-SNAPSHOT)
* fitnesse.slim.test(20130316.0.0.1-SNAPSHOT)
* fitnesse.slim.test.library(20130316.0.0.1-SNAPSHOT)
* fitnesse.slim.test.testSlimInThisPackageShouldNotBeTheOneUsed(20130316.0.0.1-SNAPSHOT)
* fitnesse.socketservice(20130316.0.0.1-SNAPSHOT)
* fitnesse.testrunner(20130316.0.0.1-SNAPSHOT)
* fitnesse.testsystems(20130316.0.0.1-SNAPSHOT)
* fitnesse.testsystems.fit(20130316.0.0.1-SNAPSHOT)
* fitnesse.testsystems.slim(20130316.0.0.1-SNAPSHOT)
* fitnesse.testsystems.slim.results(20130316.0.0.1-SNAPSHOT)
* fitnesse.testsystems.slim.tables(20130316.0.0.1-SNAPSHOT)
* fitnesse.testutil(20130316.0.0.1-SNAPSHOT)
* fitnesse.tools(20130316.0.0.1-SNAPSHOT)
* fitnesse.updates(20130316.0.0.1-SNAPSHOT)
* fitnesse.util(20130316.0.0.1-SNAPSHOT)
* fitnesse.wiki(20130316.0.0.1-SNAPSHOT)
* fitnesse.wiki.fs(20130316.0.0.1-SNAPSHOT)
* fitnesse.wiki.mem(20130316.0.0.1-SNAPSHOT)
* fitnesse.wiki.refactoring(20130316.0.0.1-SNAPSHOT)
* fitnesse.wiki.search(20130316.0.0.1-SNAPSHOT)
* fitnesse.wikitext(20130316.0.0.1-SNAPSHOT)
* fitnesse.wikitext.parser(20130316.0.0.1-SNAPSHOT)
* fitnesse.wikitext.test(20130316.0.0.1-SNAPSHOT)
* fitnesseMain(20130316.0.0.1-SNAPSHOT)
* fitnesseMain.ant(20130316.0.0.1-SNAPSHOT)
* org.fitnesse.triviaGameExample(20130316.0.0.1-SNAPSHOT)
* org.fitnesse.triviaGameExample.fitnesseFixtures(20130316.0.0.1-SNAPSHOT)
* util(20130316.0.0.1-SNAPSHOT)

## OSGi Dependencies
* __System Bundle - org.apache.felix.framework (4.0.3)__
	* javax.naming
	* javax.script
	* javax.sql
	* javax.swing
	* javax.swing.text
	* javax.xml.parsers
	* javax.xml.parsers
	* org.ietf.jgss
	* org.w3c.dom
	* org.w3c.dom
	* org.xml.sax
	* org.xml.sax
	* org.xml.sax.helpers
	* org.xml.sax.helpers
* __OPS4J Pax Logging - API - org.ops4j.pax.logging.pax-logging-api (1.7.0)__
	* org.apache.commons.logging
	* org.apache.commons.logging
	* org.apache.log4j
* __Servlet 3.0 - org.apache.geronimo.specs.geronimo-servlet_3.0_spec (1.0)__
	* javax.servlet
	* javax.servlet
	* javax.servlet.http
	* javax.servlet.http
* __Apache ServiceMix :: Bundles :: junit - org.apache.servicemix.bundles.junit (3.8.2.4)__
	* junit.framework

## OSGi Embedded JARs

## Dependency Graph
![alt text](http://raw.github.com.everydayimmirror.in/liveSense/org.liveSense.framework.fitnesse/master/osgidependencies.svg "")