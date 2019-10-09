package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object alcoholWarning extends PropertyDef(
        iri = "http://schema.org/alcoholWarning",
        iris = Set("http://schema.org/alcoholWarning"),
        label = "alcoholWarning",
        comment = """Any precaution, guidance, contraindication, etc. related to consumption of alcohol while taking this drug.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}