package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object cookingMethod extends PropertyDef(
        iri = "http://schema.org/cookingMethod",
        iris = Set("http://schema.org/cookingMethod"),
        label = "cookingMethod",
        comment = """The method of cooking, such as Frying, Steaming, ...""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}