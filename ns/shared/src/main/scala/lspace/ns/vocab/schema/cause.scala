package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object cause extends PropertyDef(
        iri = "http://schema.org/cause",
        iris = Set("http://schema.org/cause"),
        label = "cause",
        comment = """Specifying a cause of something in general. e.g in medicine , one of the causative agent(s) that are most directly responsible for the pathophysiologic process that eventually results in the occurrence.""",
        `@extends` = () => List(),
        `@range` = () => List(MedicalCause.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}