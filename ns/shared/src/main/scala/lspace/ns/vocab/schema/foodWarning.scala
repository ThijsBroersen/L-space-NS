package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object foodWarning extends PropertyDef(
        iri = "http://schema.org/foodWarning",
        iris = Set("http://schema.org/foodWarning"),
        label = "foodWarning",
        comment = """Any precaution, guidance, contraindication, etc. related to consumption of specific foods while taking this drug.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}