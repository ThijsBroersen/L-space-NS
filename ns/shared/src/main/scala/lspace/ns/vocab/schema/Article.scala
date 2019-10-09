package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Article extends OntologyDef(
        iri = "http://schema.org/Article",
        iris = Set("http://schema.org/Article"),
        label = "Article",
        comment = """An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.<br/><br/>

See also <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val articleBody = lspace.ns.vocab.schema.articleBody.property
lazy val articleSection = lspace.ns.vocab.schema.articleSection.property
lazy val backstory = lspace.ns.vocab.schema.backstory.property
lazy val pageEnd = lspace.ns.vocab.schema.pageEnd.property
lazy val pageStart = lspace.ns.vocab.schema.pageStart.property
lazy val pagination = lspace.ns.vocab.schema.pagination.property
lazy val speakable = lspace.ns.vocab.schema.speakable.property
lazy val wordCount = lspace.ns.vocab.schema.wordCount.property
}
override lazy val properties: List[LProperty] = List(articleBody, articleSection, backstory, pageEnd, pageStart, pagination, speakable, wordCount)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val articleBody = lspace.ns.vocab.schema.articleBody.property
lazy val articleSection = lspace.ns.vocab.schema.articleSection.property
lazy val backstory = lspace.ns.vocab.schema.backstory.property
lazy val pageEnd = lspace.ns.vocab.schema.pageEnd.property
lazy val pageStart = lspace.ns.vocab.schema.pageStart.property
lazy val pagination = lspace.ns.vocab.schema.pagination.property
lazy val speakable = lspace.ns.vocab.schema.speakable.property
lazy val wordCount = lspace.ns.vocab.schema.wordCount.property
}
}