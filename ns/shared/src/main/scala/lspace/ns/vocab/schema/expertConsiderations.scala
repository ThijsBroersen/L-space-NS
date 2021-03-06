package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object expertConsiderations extends PropertyDef(
        iri = "http://schema.org/expertConsiderations",
        iris = Set("http://schema.org/expertConsiderations"),
        label = "expertConsiderations",
        comment = """Medical expert advice related to the plan.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}