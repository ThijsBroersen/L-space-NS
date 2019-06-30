package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VoteAction extends OntologyDef(
        iri = "http://schema.org/VoteAction",
        iris = Set("http://schema.org/VoteAction"),
        label = "VoteAction",
        comment = """The act of expressing a preference from a fixed/finite/structured set of choices/options.""",
        `@extends` = () => List(ChooseAction.ontology)
       ){
}