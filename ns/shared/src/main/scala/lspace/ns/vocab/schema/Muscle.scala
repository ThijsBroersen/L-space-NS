package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Muscle extends OntologyDef(
        iri = "http://schema.org/Muscle",
        iris = Set("http://schema.org/Muscle"),
        label = "Muscle",
        comment = """A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.""",
        `@extends` = List(AnatomicalStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AnatomicalStructure.Properties{
lazy val action = lspace.ns.vocab.schema.action.property
lazy val antagonist = lspace.ns.vocab.schema.antagonist.property
lazy val bloodSupply = lspace.ns.vocab.schema.bloodSupply.property
lazy val insertion = lspace.ns.vocab.schema.insertion.property
lazy val muscleAction = lspace.ns.vocab.schema.muscleAction.property
lazy val nerve = lspace.ns.vocab.schema.nerve.property
lazy val origin = lspace.ns.vocab.schema.origin.property
}
override lazy val properties: List[LProperty] = List(action, antagonist, bloodSupply, insertion, muscleAction, nerve, origin)
trait Properties extends lspace.ns.vocab.schema.AnatomicalStructure.Properties{
lazy val action = lspace.ns.vocab.schema.action.property
lazy val antagonist = lspace.ns.vocab.schema.antagonist.property
lazy val bloodSupply = lspace.ns.vocab.schema.bloodSupply.property
lazy val insertion = lspace.ns.vocab.schema.insertion.property
lazy val muscleAction = lspace.ns.vocab.schema.muscleAction.property
lazy val nerve = lspace.ns.vocab.schema.nerve.property
lazy val origin = lspace.ns.vocab.schema.origin.property
}
}