package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object antagonist extends PropertyDef(
        iri = "http://schema.org/antagonist",
        iris = Set("http://schema.org/antagonist"),
        label = "antagonist",
        comment = """The muscle whose action counteracts the specified muscle.""",
        `@extends` = () => List(),
        `@range` = () => List(Muscle.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}