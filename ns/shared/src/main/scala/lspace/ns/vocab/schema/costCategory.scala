package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object costCategory extends PropertyDef(
        iri = "http://schema.org/costCategory",
        iris = Set("http://schema.org/costCategory"),
        label = "costCategory",
        comment = """The category of cost, such as wholesale, retail, reimbursement cap, etc.""",
        `@extends` = () => List(),
        `@range` = () => List(DrugCostCategory.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}