package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OceanBodyOfWater extends OntologyDef(
        iri = "http://schema.org/OceanBodyOfWater",
        iris = Set("http://schema.org/OceanBodyOfWater"),
        label = "OceanBodyOfWater",
        comment = """An ocean (for example, the Pacific).""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
}