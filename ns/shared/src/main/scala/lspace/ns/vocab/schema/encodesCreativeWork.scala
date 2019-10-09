package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object encodesCreativeWork extends PropertyDef(
        iri = "http://schema.org/encodesCreativeWork",
        iris = Set("http://schema.org/encodesCreativeWork"),
        label = "encodesCreativeWork",
        comment = """The CreativeWork encoded by this media object.""",
        `@extends` = List(),
        `@range` = List(CreativeWork.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}