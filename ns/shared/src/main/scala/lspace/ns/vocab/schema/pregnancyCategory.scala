package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object pregnancyCategory extends PropertyDef(
        iri = "http://schema.org/pregnancyCategory",
        iris = Set("http://schema.org/pregnancyCategory"),
        label = "pregnancyCategory",
        comment = """Pregnancy category of this drug.""",
        `@extends` = () => List(),
        `@range` = () => List(DrugPregnancyCategory.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}