package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object encoding extends PropertyDef(
        iri = "http://schema.org/encoding",
        iris = Set("http://schema.org/encoding"),
        label = "encoding",
        comment = """A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.""",
        `@extends` = () => List(),
        `@range` = () => List(MediaObject.ontology)
       ){
}