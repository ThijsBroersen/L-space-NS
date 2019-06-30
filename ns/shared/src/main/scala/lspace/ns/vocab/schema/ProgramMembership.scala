package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ProgramMembership extends OntologyDef(
        iri = "http://schema.org/ProgramMembership",
        iris = Set("http://schema.org/ProgramMembership"),
        label = "ProgramMembership",
        comment = """Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}