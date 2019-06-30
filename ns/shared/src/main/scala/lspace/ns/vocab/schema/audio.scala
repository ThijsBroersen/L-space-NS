package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object audio extends PropertyDef(
        iri = "http://schema.org/audio",
        iris = Set("http://schema.org/audio"),
        label = "audio",
        comment = """An embedded audio object.""",
        `@extends` = () => List(),
        `@range` = () => List(Clip.ontology, AudioObject.ontology)
       ){
}