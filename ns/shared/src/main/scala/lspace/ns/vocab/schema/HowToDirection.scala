package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HowToDirection extends OntologyDef(
        iri = "http://schema.org/HowToDirection",
        iris = Set("http://schema.org/HowToDirection"),
        label = "HowToDirection",
        comment = """A direction indicating a single action to do in the instructions for how to achieve a result.""",
        `@extends` = List(CreativeWork.ontology, ListItem.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties with lspace.ns.vocab.schema.ListItem.Properties{
lazy val afterMedia = lspace.ns.vocab.schema.afterMedia.property
lazy val beforeMedia = lspace.ns.vocab.schema.beforeMedia.property
lazy val duringMedia = lspace.ns.vocab.schema.duringMedia.property
lazy val performTime = lspace.ns.vocab.schema.performTime.property
lazy val prepTime = lspace.ns.vocab.schema.prepTime.property
lazy val supply = lspace.ns.vocab.schema.supply.property
lazy val tool = lspace.ns.vocab.schema.tool.property
lazy val totalTime = lspace.ns.vocab.schema.totalTime.property
override lazy val position = lspace.ns.vocab.schema.position.property}
override lazy val properties: List[LProperty] = List(afterMedia, beforeMedia, duringMedia, performTime, prepTime, supply, tool, totalTime)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties with lspace.ns.vocab.schema.ListItem.Properties{
lazy val afterMedia = lspace.ns.vocab.schema.afterMedia.property
lazy val beforeMedia = lspace.ns.vocab.schema.beforeMedia.property
lazy val duringMedia = lspace.ns.vocab.schema.duringMedia.property
lazy val performTime = lspace.ns.vocab.schema.performTime.property
lazy val prepTime = lspace.ns.vocab.schema.prepTime.property
lazy val supply = lspace.ns.vocab.schema.supply.property
lazy val tool = lspace.ns.vocab.schema.tool.property
lazy val totalTime = lspace.ns.vocab.schema.totalTime.property
override lazy val position = lspace.ns.vocab.schema.position.property}
}