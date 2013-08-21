Bails - Bash script extensions for Grails
=========================================

# Introduction

Bails is a set of bash scripts aimed at making [grails][1] development simpler.

Bails makes some assumptions about the tools and libraries you have available, and should make life easier if you're using them.

## Motivation

* grails scripts don't exist for some common tasks
* running grails scripts is slow
* writing codenarc rules is beyond me

# Stack

Bails assumes you are using the following frameworks/tools/languages and will help you to integrate with them:

* [Git][3]
* [Jenkins][4]
* [Jenkins Violations Plugin][6]

# Requirements

Bails requires the following tools/frameworks/languages for some or all of its functionality:

* [bash][2]
* GNU-compatible tools (inc. sed and grep) (requires special setup on OSX)
* [nodejs][4]

# Installation

## symlink

1. download bails onto your computer: `git clone ____`
2. set up the BAILS_HOME environment variable
3. link to bails inside your grails project: `ln -s bails $BAILS_HOME/scripts`

## as git submodule

This approach is probably more suitable... TODO document it

# Use

To execute a bails script, just call `bails/$scriptName` from your grails project's root directory.

# The scripts

Hopefully the script names are intuitive.  Here is a summary of those available:

## check_for/..

These are similar to codenarc rules - static 'analysis' (usually grepping) for antipatterns in source code.

## test/..

These scripts help repeat common and less common test functionality.

## report/..

These scripts run some kind of metrics on your code and produce reports for these metrics.

## violations

These scripts are for integration with the [Jenkins Violations Plugin][6].

# Scripts TODO

	build_deploy
	optimise_images
	release
	run_with_updated_snapshots
	test_and_backup
	test_functional
	test_migrations
	
	plugin/build
	plugin/build_deploy
	plugin/release
	plugin/rm_excluded_files

	jsunit/test
	jsunit/xunit_report

# Release Notes

## 0.1

## TODO

* add all the scripts
* document git submodule setup

[1]: http://www.grails.org
[2]: http://www.gnu.org/software/bash/manual/bashref.html
[3]: http://git-scm.com/
[4]: http://nodejs.org/
[5]: http://jenkins-ci.org/
[6]: https://wiki.jenkins-ci.org/display/JENKINS/Violations

