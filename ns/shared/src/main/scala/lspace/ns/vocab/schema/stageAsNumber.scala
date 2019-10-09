package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object stageAsNumber extends PropertyDef(
        iri = "http://schema.org/stageAsNumber",
        iris = Set("http://schema.org/stageAsNumber"),
        label = "stageAsNumber",
        comment = """The stage represented as a number, e.g. 3.""",
        `@extends` = List(),
        `@range` = List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}