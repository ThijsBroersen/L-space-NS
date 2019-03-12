package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object publishingPrinciples extends PropertyDef(
        iri = "https://schema.org/publishingPrinciples",
        iris = Set("https://schema.org/publishingPrinciples"),
        label = "publishingPrinciples",
        comment = """The publishingPrinciples property indicates (typically via <a class="localLink" href="http://schema.org/URL">URL</a>) a document describing the editorial principles of an <a class="localLink" href="http://schema.org/Organization">Organization</a> (or individual e.g. a <a class="localLink" href="http://schema.org/Person">Person</a> writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a> (e.g. <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a>) the principles are those of the party primarily responsible for the creation of the <a class="localLink" href="http://schema.org/CreativeWork">CreativeWork</a>.<br/><br/>

While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a <a class="localLink" href="http://schema.org/funder">funder</a>) can be expressed using schema.org terminology.""",
        `@extends` = () => List(),
        `@range` = () => List(`@url`, CreativeWork)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}