package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object temporal extends PropertyDef(
        iri = "https://schema.org/temporal",
        iris = Set("https://schema.org/temporal"),
        label = "temporal",
        comment = """The "temporal" property can be used in cases where more specific properties
(e.g. <a class="localLink" href="http://schema.org/temporalCoverage">temporalCoverage</a>, <a class="localLink" href="http://schema.org/dateCreated">dateCreated</a>, <a class="localLink" href="http://schema.org/dateModified">dateModified</a>, <a class="localLink" href="http://schema.org/datePublished">datePublished</a>) are not known to be appropriate.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, `@datetime`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}