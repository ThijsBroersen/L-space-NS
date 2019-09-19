package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowTo extends OntologyDef(
        iri = "http://schema.org/HowTo",
        iris = Set("http://schema.org/HowTo"),
        label = "HowTo",
        comment = """Instructions that explain how to achieve a result by performing a sequence of steps.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val estimatedCost = lspace.ns.vocab.schema.estimatedCost.property
lazy val performTime = lspace.ns.vocab.schema.performTime.property
lazy val prepTime = lspace.ns.vocab.schema.prepTime.property
lazy val step = lspace.ns.vocab.schema.step.property
lazy val supply = lspace.ns.vocab.schema.supply.property
lazy val tool = lspace.ns.vocab.schema.tool.property
lazy val totalTime = lspace.ns.vocab.schema.totalTime.property
lazy val `yield` = lspace.ns.vocab.schema.`yield`.property
}
override lazy val properties: List[LProperty] = List(estimatedCost, performTime, prepTime, step, supply, tool, totalTime, `yield`)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val estimatedCost = lspace.ns.vocab.schema.estimatedCost.property
lazy val performTime = lspace.ns.vocab.schema.performTime.property
lazy val prepTime = lspace.ns.vocab.schema.prepTime.property
lazy val step = lspace.ns.vocab.schema.step.property
lazy val supply = lspace.ns.vocab.schema.supply.property
lazy val tool = lspace.ns.vocab.schema.tool.property
lazy val totalTime = lspace.ns.vocab.schema.totalTime.property
lazy val `yield` = lspace.ns.vocab.schema.`yield`.property
}
}