package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object storageRequirements extends PropertyDef(
        iri = "http://schema.org/storageRequirements",
        iris = Set("http://schema.org/storageRequirements"),
        label = "storageRequirements",
        comment = """Storage requirements (free space required).""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, Text.ontology)
       ){
}