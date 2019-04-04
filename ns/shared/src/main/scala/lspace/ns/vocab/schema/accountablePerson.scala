package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object accountablePerson extends PropertyDef(
        iri = "https://schema.org/accountablePerson",
        iris = Set("https://schema.org/accountablePerson"),
        label = "accountablePerson",
        comment = """Specifies the Person that is legally accountable for the CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}