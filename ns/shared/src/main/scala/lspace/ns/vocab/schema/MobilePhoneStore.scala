package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MobilePhoneStore extends OntologyDef(
        iri = "http://schema.org/MobilePhoneStore",
        iris = Set("http://schema.org/MobilePhoneStore"),
        label = "MobilePhoneStore",
        comment = """A store that sells mobile phones and related accessories.""",
        `@extends` = () => List(Store.ontology)
       ){
}