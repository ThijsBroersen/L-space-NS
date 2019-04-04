package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object workExample extends PropertyDef(
        iri = "https://schema.org/workExample",
        iris = Set("https://schema.org/workExample"),
        label = "workExample",
        comment = """Example/instance/realization/derivation of the concept of this creative work. eg. The paperback edition, first edition, or eBook.""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}