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
}