---
layout: page
section: home
title: "Home"
---
**Welcome to L-space**

[![Gitter chat](https://badges.gitter.im/gitterHQ/gitter.png)](https://gitter.im/L-space/L-space-NS)
[![Waffle.io - Columns and their card count](https://badge.waffle.io/L-space/L-space-NS.svg?columns=all)](https://waffle.io/L-space/L-space-NS)

[![Build Status](https://travis-ci.org/L-space/L-space-NS.svg)](https://travis-ci.org/L-space/L-space-NS)
[![codecov](https://codecov.io/gh/L-space/L-space-NS/branch/master/graph/badge.svg)](https://codecov.io/gh/L-space/L-space-NS)

Semantic schema repository

# Getting started

L-space is available for Scala 2.11.x and 2.12.x. 
To include `lspace-core` (all core structures and basic implementations (in-memory) of the graph, 
data-models and traversal-engines) add the following to your `build.sbt`:
```
libraryDependencies += "eu.l-space" %% "lspace-ns" % "{{ site.data.settings.version }}"
```

# Modules

L-space provides additional modules for remote traversals, parsing io, rest-api templates and tinkerpop-adapters.

- `lspace-ns`: Linked Data schema's
- `lspace-ns-service`: api-service for ns.l-space.eu

```
libraryDependencies += "eu.l-space" %% "{lspace-ns-xxx}" % "{{ site.data.settings.version }}"
libraryDependencies += "eu.l-space" %% "{lspace-ns-xxx-tests}" % "{{ site.data.settings.version }}"
```

## Examples
`examples` on how to use the project modules in various environments and 
sample-environments (e.g. Jupyter-notebook with samples [https://hub.docker.com/u/lspace/](https://hub.docker.com/u/lspace/))
