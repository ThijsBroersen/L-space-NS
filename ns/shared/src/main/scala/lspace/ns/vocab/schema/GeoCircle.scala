package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GeoCircle extends OntologyDef(
        iri = "http://schema.org/GeoCircle",
        iris = Set("http://schema.org/GeoCircle"),
        label = "GeoCircle",
        comment = """A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
          it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
          The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'.""",
        `@extends` = () => List(GeoShape.ontology)
       ){
object keys extends lspace.ns.vocab.schema.GeoShape.Properties{
lazy val geoMidpoint = lspace.ns.vocab.schema.geoMidpoint.property
lazy val geoRadius = lspace.ns.vocab.schema.geoRadius.property
}
override lazy val properties: List[LProperty] = List(geoMidpoint, geoRadius)
trait Properties extends lspace.ns.vocab.schema.GeoShape.Properties{
lazy val geoMidpoint = lspace.ns.vocab.schema.geoMidpoint.property
lazy val geoRadius = lspace.ns.vocab.schema.geoRadius.property
}
}