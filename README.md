[![Gitter chat](https://badges.gitter.im/gitterHQ/gitter.png)](https://gitter.im/L-space/L-space-NS)

[![Build Status](https://travis-ci.com/L-space/L-space-NS.svg)](https://travis-ci.com/L-space/L-space-NS)
[![codecov](https://codecov.io/gh/L-space/L-space-NS/branch/master/graph/badge.svg)](https://codecov.io/gh/L-space/L-space-NS)

# L-space-NS

## Getting started

L-space-NS is available for Scala 2.11.x and 2.12.x. 
To include `lspace-ns` add the following to your `build.sbt`:
```
libraryDependencies += "eu.l-space" %% "lspace-ns" % "{version}"
```

## Modules

L-space provides additional modules for remote traversals, parsing io, rest-api templates and tinkerpop-adapters.

- `lspace-ns`: parsers for linked data
- `lspace-ns-service`: api-service for ns.l-space.eu
```
libraryDependencies += "eu.l-space" %% "{lspace-xxx}" % "{version}"
```

## Examples
`examples` on how to use the project modules in various environments and 
sample-environments (e.g. Jupyter-notebook with samples)
