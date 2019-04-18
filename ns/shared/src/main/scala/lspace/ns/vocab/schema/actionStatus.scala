package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object actionStatus extends PropertyDef(
        iri = "http://schema.org/actionStatus",
        iris = Set("http://schema.org/actionStatus"),
        label = "actionStatus",
        comment = """Indicates the current disposition of the Action.""",
        `@extends` = () => List(),
        `@range` = () => List(ActionStatusType.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}