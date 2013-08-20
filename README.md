Bails - Bash script extensions for Grails
=========================================

# Introduction

Bails is a set of bash scripts aimed at making grails development simpler.

Bails makes some assumptions about the tools and libraries you have available, and should make life easier if you're using them.

## Motivation

* grails scripts don't exist for some common tasks
* running grails scripts is slow
* writing codenarc rules is beyond me

# Stack

* bash
* GNU-compatible tools (inc. sed and grep) (requires special setup on OSX)
* git
* nodejs
* jenkins

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

# Scripts TODO

	build_deploy
	optimise_images
	release
	simian_report
	run_with_updated_snapshots
	test_and_backup
	test_backup
	test_bisect
	test_functional
	test_migrations
	
	plugin/build
	plugin/build_deploy
	plugin/release
	plugin/rm_excluded_files

	jslint/lint
	jslint/for_gsp
	jslint/json_to_xml
	jslint/violations_report

	jsunit/test
	jsunit/xunit_report

# Release Notes

## 0.1

## TODO

* add the scripts
* document git submodule setup

