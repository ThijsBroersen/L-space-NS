package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accountablePerson extends PropertyDef(
        iri = "http://schema.org/accountablePerson",
        iris = Set("http://schema.org/accountablePerson"),
        label = "accountablePerson",
        comment = """Specifies the Person that is legally accountable for the CreativeWork.""",
        `@extends` = List(),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}