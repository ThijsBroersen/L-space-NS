package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LibrarySystem extends OntologyDef(
        iri = "http://schema.org/LibrarySystem",
        iris = Set("http://schema.org/LibrarySystem"),
        label = "LibrarySystem",
        comment = """A <a class="localLink" href="http://schema.org/LibrarySystem">LibrarySystem</a> is a collaborative system amongst several libraries.""",
        `@extends` = () => List(Organization.ontology)
       ){
}