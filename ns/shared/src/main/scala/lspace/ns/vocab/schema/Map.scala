package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Map extends OntologyDef(
        iri = "http://schema.org/Map",
        iris = Set("http://schema.org/Map"),
        label = "Map",
        comment = """A map.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val mapType = lspace.ns.vocab.schema.mapType.property
}
override lazy val properties: List[LProperty] = List(mapType)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val mapType = lspace.ns.vocab.schema.mapType.property
}
}