package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object workload extends PropertyDef(
        iri = "http://schema.org/workload",
        iris = Set("http://schema.org/workload"),
        label = "workload",
        comment = """Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.""",
        `@extends` = () => List(),
        `@range` = () => List(QualitativeValue.ontology, Energy.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}