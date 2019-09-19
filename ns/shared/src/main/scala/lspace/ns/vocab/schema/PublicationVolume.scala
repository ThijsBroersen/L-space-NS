package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PublicationVolume extends OntologyDef(
        iri = "http://schema.org/PublicationVolume",
        iris = Set("http://schema.org/PublicationVolume"),
        label = "PublicationVolume",
        comment = """A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.<br/><br/>

<pre><code>  &lt;br/&gt;&lt;br/&gt;See also &lt;a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html"&gt;blog post&lt;/a&gt;.
</code></pre>
""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val pageEnd = lspace.ns.vocab.schema.pageEnd.property
lazy val pageStart = lspace.ns.vocab.schema.pageStart.property
lazy val pagination = lspace.ns.vocab.schema.pagination.property
lazy val volumeNumber = lspace.ns.vocab.schema.volumeNumber.property
}
override lazy val properties: List[LProperty] = List(pageEnd, pageStart, pagination, volumeNumber)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val pageEnd = lspace.ns.vocab.schema.pageEnd.property
lazy val pageStart = lspace.ns.vocab.schema.pageStart.property
lazy val pagination = lspace.ns.vocab.schema.pagination.property
lazy val volumeNumber = lspace.ns.vocab.schema.volumeNumber.property
}
}