package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sharedContent extends PropertyDef(
        iri = "http://schema.org/sharedContent",
        iris = Set("http://schema.org/sharedContent"),
        label = "sharedContent",
        comment = """A CreativeWork such as an image, video, or audio clip shared as part of this posting.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology)
       ){
}