package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReportageNewsArticle extends OntologyDef(
        iri = "http://schema.org/ReportageNewsArticle",
        iris = Set("http://schema.org/ReportageNewsArticle"),
        label = "ReportageNewsArticle",
        comment = """The <a class="localLink" href="http://schema.org/ReportageNewsArticle">ReportageNewsArticle</a> type is a subtype of <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> representing
 news articles which are the result of journalistic news reporting conventions.<br/><br/>

In practice many news publishers produce a wide variety of article types, many of which might be considered a <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> but not a <a class="localLink" href="http://schema.org/ReportageNewsArticle">ReportageNewsArticle</a>. For example, opinion pieces, reviews, analysis, sponsored or satirical articles, or articles that combine several of these elements.<br/><br/>

The <a class="localLink" href="http://schema.org/ReportageNewsArticle">ReportageNewsArticle</a> type is based on a stricter ideal for "news" as a work of journalism, with articles based on factual information either observed or verified by the author, or reported and verified from knowledgeable sources.  This often includes perspectives from multiple viewpoints on a particular issue (distinguishing news reports from public relations or propaganda).  News reports in the <a class="localLink" href="http://schema.org/ReportageNewsArticle">ReportageNewsArticle</a> sense de-emphasize the opinion of the author, with commentary and value judgements typically expressed elsewhere.<br/><br/>

A <a class="localLink" href="http://schema.org/ReportageNewsArticle">ReportageNewsArticle</a> which goes deeper into analysis can also be marked with an additional type of <a class="localLink" href="http://schema.org/AnalysisNewsArticle">AnalysisNewsArticle</a>.""",
        `@extends` = List(NewsArticle.ontology)
       ){
object keys extends lspace.ns.vocab.schema.NewsArticle.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.NewsArticle.Properties{

}
}