package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Number extends OntologyDef(
        iri = "http://schema.org/Number",
        iris = Set("http://schema.org/Number"),
        label = "",
        comment = """""",
        `@extends` = () => List()
       ){
}