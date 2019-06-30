package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DepartmentStore extends OntologyDef(
        iri = "http://schema.org/DepartmentStore",
        iris = Set("http://schema.org/DepartmentStore"),
        label = "DepartmentStore",
        comment = """A department store.""",
        `@extends` = () => List(Store.ontology)
       ){
}