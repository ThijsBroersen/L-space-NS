package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object associatedMedia extends PropertyDef(
        iri = "http://schema.org/associatedMedia",
        iris = Set("http://schema.org/associatedMedia"),
        label = "associatedMedia",
        comment = """A media object that encodes this CreativeWork. This property is a synonym for encoding.""",
        `@extends` = List(),
        `@range` = List(MediaObject.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}