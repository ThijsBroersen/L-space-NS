package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Attorney extends OntologyDef(
        iri = "http://schema.org/Attorney",
        iris = Set("http://schema.org/Attorney"),
        label = "Attorney",
        comment = """Professional service: Attorney. <br/><br/>

This type is deprecated - <a class="localLink" href="http://schema.org/LegalService">LegalService</a> is more inclusive and less ambiguous.""",
        `@extends` = () => List(LegalService.ontology)
       ){
}