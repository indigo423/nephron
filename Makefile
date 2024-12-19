##
# Makefile to build the Nephron project
##
.DEFAULT_GOAL := nephron

SHELL               := /bin/bash -o nounset -o pipefail -o errexit
MAVEN_SETTINGS_XML  ?= ./.cicd-assets/settings.xml
WORKING_DIRECTORY   := $(shell pwd)
SITE_FILE           := antora-playbook-local.yml

help:
	@echo ""
	@echo "Makefile to build artifacts for Nephron"
	@echo ""
	@echo "Targets:"
	@echo "  help:             Show this help"
	@echo "  docs-deps:        Test requirements to run Antora from the local system"
	@echo "  docs:             Build Antora docs with a local install Antora, default target"
	@echo ""
	@echo "Arguments: "
	@echo "  SITE_FILE:           Antora site.yml file to build the site"
	@echo ""

.PHONY deps:
deps:
	@command -v java
	@command -v javac
	@command -v mvn
	@git submodule update --init --recursive

.PHONY deps-docs:
deps-docs:
	@command -v antora

.PHONY docs:
docs: deps-docs
	@echo "Build Antora docs..."
	antora --stacktrace $(SITE_FILE)

.PHONY docs-clean:
docs-clean:
	@echo "Delete build and public artifacts ..."
	@rm -rf build public

.PHONY build:
nephron: deps
	mvn --settings=$(MAVEN_SETTINGS_XML) package

.PHONY clean:
clean: deps
	mvn --settings=$(MAVEN_SETTINGS_XML) clean