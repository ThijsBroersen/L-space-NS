package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Vessel extends OntologyDef(
        iri = "http://schema.org/Vessel",
        iris = Set("http://schema.org/Vessel"),
        label = "Vessel",
        comment = """A component of the human body circulatory system comprised of an intricate network of hollow tubes that transport blood throughout the entire body.""",
        `@extends` = () => List(AnatomicalStructure.ontology)
       ){
}