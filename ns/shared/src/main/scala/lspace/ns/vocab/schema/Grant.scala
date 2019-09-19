package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Grant extends OntologyDef(
        iri = "http://schema.org/Grant",
        iris = Set("http://schema.org/Grant"),
        label = "Grant",
        comment = """A grant, typically financial or otherwise quantifiable, of resources. Typically a <a class="localLink" href="http://schema.org/funder">funder</a> sponsors some <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a> to an <a class="localLink" href="http://schema.org/Organization">Organization</a> or <a class="localLink" href="http://schema.org/Person">Person</a>,
    sometimes not necessarily via a dedicated or long-lived <a class="localLink" href="http://schema.org/Project">Project</a>, resulting in one or more outputs, or <a class="localLink" href="http://schema.org/fundedItem">fundedItem</a>s. For financial sponsorship, indicate the <a class="localLink" href="http://schema.org/funder">funder</a> of a <a class="localLink" href="http://schema.org/MonetaryGrant">MonetaryGrant</a>. For non-financial support, indicate <a class="localLink" href="http://schema.org/sponsor">sponsor</a> of <a class="localLink" href="http://schema.org/Grant">Grant</a>s of resources (e.g. office space).<br/><br/>

Grants support  activities directed towards some agreed collective goals, often but not always organized as <a class="localLink" href="http://schema.org/Project">Project</a>s. Long-lived projects are sometimes sponsored by a variety of grants over time, but it is also common for a project to be associated with a single grant.<br/><br/>

The amount of a <a class="localLink" href="http://schema.org/Grant">Grant</a> is represented using <a class="localLink" href="http://schema.org/amount">amount</a> as a <a class="localLink" href="http://schema.org/MonetaryAmount">MonetaryAmount</a>.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val fundedItem = lspace.ns.vocab.schema.fundedItem.property
lazy val sponsor = lspace.ns.vocab.schema.sponsor.property
}
override lazy val properties: List[LProperty] = List(fundedItem, sponsor)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val fundedItem = lspace.ns.vocab.schema.fundedItem.property
lazy val sponsor = lspace.ns.vocab.schema.sponsor.property
}
}