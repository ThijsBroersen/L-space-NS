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
lazy val step = lspace.ns.vocab.schema.step.property
lazy val prepTime = lspace.ns.vocab.schema.prepTime.property
lazy val tool = lspace.ns.vocab.schema.tool.property
lazy val estimatedCost = lspace.ns.vocab.schema.estimatedCost.property
lazy val steps = lspace.ns.vocab.schema.steps.property
lazy val performTime = lspace.ns.vocab.schema.performTime.property
lazy val totalTime = lspace.ns.vocab.schema.totalTime.property
lazy val `yield` = lspace.ns.vocab.schema.`yield`.property
lazy val supply = lspace.ns.vocab.schema.supply.property
}
override lazy val properties: List[LProperty] = List(step, prepTime, tool, estimatedCost, steps, performTime, totalTime, `yield`, supply)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val step = lspace.ns.vocab.schema.step.property
lazy val prepTime = lspace.ns.vocab.schema.prepTime.property
lazy val tool = lspace.ns.vocab.schema.tool.property
lazy val estimatedCost = lspace.ns.vocab.schema.estimatedCost.property
lazy val steps = lspace.ns.vocab.schema.steps.property
lazy val performTime = lspace.ns.vocab.schema.performTime.property
lazy val totalTime = lspace.ns.vocab.schema.totalTime.property
lazy val `yield` = lspace.ns.vocab.schema.`yield`.property
lazy val supply = lspace.ns.vocab.schema.supply.property
}
}