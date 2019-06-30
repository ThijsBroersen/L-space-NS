package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Clip extends OntologyDef(
        iri = "http://schema.org/Clip",
        iris = Set("http://schema.org/Clip"),
        label = "Clip",
        comment = """A short TV or radio program or a segment/part of a program.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}