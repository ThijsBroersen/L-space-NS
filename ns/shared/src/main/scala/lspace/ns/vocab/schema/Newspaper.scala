package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Newspaper extends OntologyDef(
        iri = "http://schema.org/Newspaper",
        iris = Set("http://schema.org/Newspaper"),
        label = "Newspaper",
        comment = """A publication containing information about varied topics that are pertinent to general information, a geographic area, or a specific subject matter (i.e. business, culture, education). Often published daily.""",
        `@extends` = () => List(Periodical.ontology)
       ){
}