package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object salaryCurrency extends PropertyDef(
        iri = "http://schema.org/salaryCurrency",
        iris = Set("http://schema.org/salaryCurrency"),
        label = "salaryCurrency",
        comment = """The currency (coded using <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> ) used for the main salary information in this job posting or for this employee.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}